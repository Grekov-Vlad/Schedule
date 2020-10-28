package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class Main extends Application {
    public static ObservableList<XYChart.Data> up(double i,final int[] values_a) {
    	ObservableList<XYChart.Data> data_a = null;
    	if(i == 0.0) {
    		data_a = FXCollections.observableArrayList(
		        new XYChart.Data(0, ++values_a[0]),
		        new XYChart.Data(1, values_a[1]),
		        new XYChart.Data(2, values_a[2]),
		        new XYChart.Data(3, values_a[3]),
		        new XYChart.Data(4, values_a[4]));
    	}else if(i == 112.0) {
    		data_a = FXCollections.observableArrayList(
		        new XYChart.Data(0, values_a[0]),
		        new XYChart.Data(1, ++values_a[1]),
		        new XYChart.Data(2, values_a[2]),
		        new XYChart.Data(3, values_a[3]),
		        new XYChart.Data(4, values_a[4]));
    	}else if(i == 224.0) {
    		data_a = FXCollections.observableArrayList(
		        new XYChart.Data(0, values_a[0]),
		        new XYChart.Data(1, values_a[1]),
		        new XYChart.Data(2, ++values_a[2]),
		        new XYChart.Data(3, values_a[3]),
		        new XYChart.Data(4, values_a[4]));
    	}else if(i == 336.0) {
    		data_a = FXCollections.observableArrayList(
		        new XYChart.Data(0, values_a[0]),
		        new XYChart.Data(1, values_a[1]),
		        new XYChart.Data(2, values_a[2]),
		        new XYChart.Data(3, ++values_a[3]),
		        new XYChart.Data(4, values_a[4]));
    	}else if(i == 448.0) {
    		data_a = FXCollections.observableArrayList(
		        new XYChart.Data(0, values_a[0]),
		        new XYChart.Data(1, values_a[1]),
		        new XYChart.Data(2, values_a[2]),
		        new XYChart.Data(3, values_a[3]),
		        new XYChart.Data(4, ++values_a[4]));
    	}
    	return data_a;
    }
    public static ObservableList<XYChart.Data> down(double i,final int[] values_a) {
    	ObservableList<XYChart.Data> data_a = null;
    	if(i == 0.0) {
    		data_a = FXCollections.observableArrayList(
		        new XYChart.Data(0, --values_a[0]),
		        new XYChart.Data(1, values_a[1]),
		        new XYChart.Data(2, values_a[2]),
		        new XYChart.Data(3, values_a[3]),
		        new XYChart.Data(4, values_a[4]));
    	}else if(i == 112.0) {
    		data_a = FXCollections.observableArrayList(
		        new XYChart.Data(0, values_a[0]),
		        new XYChart.Data(1, --values_a[1]),
		        new XYChart.Data(2, values_a[2]),
		        new XYChart.Data(3, values_a[3]),
		        new XYChart.Data(4, values_a[4]));
    	}else if(i == 224.0) {
    		data_a = FXCollections.observableArrayList(
		        new XYChart.Data(0, values_a[0]),
		        new XYChart.Data(1, values_a[1]),
		        new XYChart.Data(2, --values_a[2]),
		        new XYChart.Data(3, values_a[3]),
		        new XYChart.Data(4, values_a[4]));
    	}else if(i == 336.0) {
    		data_a = FXCollections.observableArrayList(
		        new XYChart.Data(0, values_a[0]),
		        new XYChart.Data(1, values_a[1]),
		        new XYChart.Data(2, values_a[2]),
		        new XYChart.Data(3, --values_a[3]),
		        new XYChart.Data(4, values_a[4]));
    	}else if(i == 448.0) {
    		data_a = FXCollections.observableArrayList(
		        new XYChart.Data(0, values_a[0]),
		        new XYChart.Data(1, values_a[1]),
		        new XYChart.Data(2, values_a[2]),
		        new XYChart.Data(3, values_a[3]),
		        new XYChart.Data(4, --values_a[4]));
    	}
    	return data_a;
    }
	@Override
	public void start(Stage primaryStage) {
		try {
			int x = 0, y = 358;
			final int size = 5;
			Button[] u_button = new Button[size];
			for(int i = 0; i < size; i++) {
				u_button[i] = new Button();
				u_button[i].setMinSize(70, 10);
				u_button[i].setLayoutX(x);
				u_button[i].setLayoutY(y);
				u_button[i].setText("∧");
				x += 112;
			}
			x = 0;
			Button[] d_button = new Button[size];
			for(int i = 0; i < size; i++) {
				d_button[i] = new Button();
				d_button[i].setMinSize(70, 10);
				d_button[i].setLayoutX(x);
				d_button[i].setLayoutY(y+25);
				d_button[i].setText("∨");
				x += 112;
			}

			final NumberAxis xAxis = new NumberAxis(0, 4, 1);
	        final NumberAxis yAxis = new NumberAxis(0, 4, 1);
	        final AreaChart<Number,Number> ac = new AreaChart<>(xAxis,yAxis);
	 
	        XYChart.Series seriesApril= new XYChart.Series();
	        final int[] values_a = {2,2,2,2,2,2,2,2};
    		ObservableList<XYChart.Data> data_a = FXCollections.observableArrayList(
    		        new XYChart.Data(0, values_a[0]),
    		        new XYChart.Data(1, values_a[1]),
    		        new XYChart.Data(2, values_a[2]),
    		        new XYChart.Data(3, values_a[3]),
    		        new XYChart.Data(4, values_a[4]));
    		seriesApril.setData(FXCollections.observableArrayList(data_a));
	        
	        XYChart.Series seriesMay = new XYChart.Series();
	        final int[] values = {1,1,1,1,1,1,1,1};
    		ObservableList<XYChart.Data> data = FXCollections.observableArrayList(
    		        new XYChart.Data(0, values[0]),
    		        new XYChart.Data(1, values[1]),
    		        new XYChart.Data(2, values[2]),
    		        new XYChart.Data(3, values[3]),
    		        new XYChart.Data(4, values[4]));
    		seriesMay.setData(FXCollections.observableArrayList(data));
			Scene scene = new Scene(new Group(),523,470);
	        ac.getData().addAll(seriesApril, seriesMay);

	        seriesApril.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED,
	                new EventHandler<MouseEvent>() {
	                @Override 
	                public void handle(MouseEvent e) {
	                	for(final Button u_b: u_button) {
	                		u_b.setOnAction(new EventHandler<ActionEvent>() {
			                	@Override
			                	public void handle(ActionEvent event) {
			                		seriesApril.setData(FXCollections.observableArrayList(up(u_b.getLayoutX(),values_a)));
			                	}
	                		});
	                	}
	                	for(final Button d_b: d_button) {
	                		d_b.setOnAction(new EventHandler<ActionEvent>() {
			                	@Override
			                	public void handle(ActionEvent event) {
			                		seriesApril.setData(FXCollections.observableArrayList(down(d_b.getLayoutX(),values_a)));
			                	}
	                		});
	                	}
	                }
		        });

	        seriesMay.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                @Override 
                public void handle(MouseEvent e) {
                	for(final Button u_b: u_button) {
                		u_b.setOnAction(new EventHandler<ActionEvent>() {
		                	@Override
		                	public void handle(ActionEvent event) {
		                		seriesMay.setData(FXCollections.observableArrayList(up(u_b.getLayoutX(),values)));
		                	}
                		});
                	}
                	for(final Button d_b: d_button) {
                		d_b.setOnAction(new EventHandler<ActionEvent>() {
		                	@Override
		                	public void handle(ActionEvent event) {
		                		seriesMay.setData(FXCollections.observableArrayList(down(d_b.getLayoutX(),values)));
		                	}
                		});
                	}
                }
	        });

	        ((Group) scene.getRoot()).getChildren().addAll(ac,u_button[0],u_button[1],u_button[2],u_button[3],u_button[4],d_button[0],d_button[1],d_button[2],d_button[3],d_button[4]);
	        primaryStage.setScene(scene);
	        primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}


//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
