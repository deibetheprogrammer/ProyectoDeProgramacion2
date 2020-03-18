/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodeprogra2;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;
import javax.swing.JPanel;

/**
 *
 * @author DavidBendeck
 */
public class ViewMap extends JFXPanel {

    private WebView webComponent;
    private String mapType;

    public ViewMap(JPanel parent, ArrayList<String[]> markers,String mapType) {
        this.mapType=mapType;
        int w = parent.getWidth();
        int h = parent.getHeight();
        parent.setLayout(new BorderLayout());
        parent.add(this, BorderLayout.CENTER);
        loadJavaFXScene(markers, w, h, this);

    }

    public void loadJavaFXScene(ArrayList<String[]> markers, int w, int h, JFXPanel jfxpanel) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                BorderPane borderPane = new BorderPane();
                webComponent = new WebView();
                String azul = "{url: \"http://maps.google.com/mapfiles/ms/icons/blue-dot.png\" }";
                String rojo = "{url: \"http://maps.google.com/mapfiles/ms/icons/red-dot.png\" }";
                String verde = "{url: \"http://maps.google.com/mapfiles/ms/icons/green-dot.png\" }";
                String persona = "{url: \"http://maps.google.com/mapfiles/kml/shapes/man.png\" }";
                
                

                String atv = "{url: \"" + iconPath("resources/atv.png")+ "\"}";
                String auto = "{url: \"" + iconPath("resources/sportscar.png")+ "\"}";
                String persona2 = "{url: \"" + iconPath("resources/male-2.png")+ "\"}";
                 
                String ht;
                ht = "<html><head><title>Simple Map</title>";
                ht += "<meta name=\"viewport\" content=\"initial-scale=1.0\">";
                ht += "<meta charset=\"utf-8\">";
                ht += "<style>#map {height: 100%;}";
                /* Optional: Makes the sample page fill the window. */
                ht += "html, body {height: 100%; margin: 0; padding: 0;}</style></head><body><div id=\"map\"></div>";
                ht += "<script>function initMap() { ";
        
                ht += "var map = new google.maps.Map(document.getElementById('map'), {zoom: 15,center: " + gmLoc(markers.get(0)[2],markers.get(0)[3]) + ",mapTypeId: '"+ mapType + "'});";

                int c = 1;
                for (var marker : markers) {
                    ht += "\nvar contentString" + c + " = '<div id=\"content\">'";
                    ht += "+'<div id=\"bodyContent\">'+";
                    ht += "'<p>" + marker[1] + "</p>'";
                    ht += "+'</div>'";
                    ht += "+'</div>';";
                    ht += "var infowindow" + c + " = new google.maps.InfoWindow({content: contentString" + c + "});\n";
                    ht += "var marker" + c + " = new google.maps.Marker({animation: google.maps.Animation.DROP,position:" + gmLoc(marker[2],marker[3]) +  ", map: map,title: '"+marker[0]+"', icon: '"+ iconPath(marker[4]) +"'});\n";
                    ht += "marker" + c + ".addListener('click', function() {infowindow" + c + ".open(map, marker" + c + ");});\n";
                    c += 1;
                }
                String key = "";
                try (BufferedReader br = new BufferedReader(new FileReader("../../miApi.txt"))) {
                    String line;
                    line = br.readLine();
                    key = line;
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                ht += "}</script>";
                System.out.println("ht " + ht);
                ht += "<script src=\"https://maps.googleapis.com/maps/api/js?key=" + key + "&callback=initMap\"";
                ht += "async defer></script></body></html>";

                webComponent.getEngine().loadContent(ht, "text/html");
                borderPane.setCenter(webComponent);
                Scene scene = new Scene(borderPane, w, h);
                jfxpanel.setScene(scene);
            }
        });
    }
    private String gmLoc(String sLat,String sLng){
        return "{lat:"+sLat+", lng: "+sLng+"}";
    }
    private String iconPath(String name){
        File f = new File("resources/"+name+".png");
        return f.toURI().toString();
    }
}
