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
class ProxyImage implements Image{
    private Image image;
    private String fileName;
    
    public ProxyImage(String afileName){
        fileName = afileName;
    }
    
    @Override
    public void showData() {
        System.out.println(fileName);
    }

    @Override
    public void displayImage() {
        if(image == null){
            image = new RealImage(fileName);
        }
        image.displayImage();
    }
}
