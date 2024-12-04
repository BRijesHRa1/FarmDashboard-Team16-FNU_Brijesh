@FXML
    private ToggleGroup droneActions;
    @FXML
    private RadioButton visitItemRadio;
@FXML
    private void executeDroneAction() {
        RadioButton selectedAction = (RadioButton) droneActions.getSelectedToggle();
        if (selectedAction != null) {
            if ("Visit Item".equals(selectedAction.getText())) {
                if (selectedItem != null) {
                    animateDroneTo(selectedItem.getLocationX(), selectedItem.getLocationY());
                } else {
                    showError("No Selection", "Please select an item or container to visit.");
                }
            } else if ("Scan Farm".equals(selectedAction.getText())) {
                animateDroneScanFarm();
            }
        } else {
            showError("No Action Selected","");
        }
    }
    private void animateDroneTo(double targetX, double targetY) {
        Timeline timeline = new Timeline(
            new KeyFrame(Duration.ZERO, new KeyValue(droneX, droneX.get()), new KeyValue(droneY, droneY.get())),
            new KeyFrame(Duration.seconds(2), new KeyValue(droneX, targetX), new KeyValue(droneY, targetY))
        );
        timeline.play();
    }


