/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.proxy;

/**
 *
 * @author tanel
 */
public class RealImage implements Image{
    private String fileName;
    
    public RealImage(String afileName){
        fileName = afileName;
        loadImageFromDisk();
    }
    
    private void loadImageFromDisk(){
        System.out.println("Loading " + fileName);
    }
    
    @Override
    public void showData() {
        System.out.println(fileName);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying " + fileName);
    }
}