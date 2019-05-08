/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.facade;

/**
 *
 * @author tanel
 */

class HardDrive{
    public static final long BOOT_SECTOR = 0x000;
    public static final int SECTOR_SIZE = 512;
            
    public byte[] read(long lba, int size){
        System.out.println("Reading " + size + " bytes from sector " + Long.toHexString(lba));
        byte[] data = new byte[size];
        for(int i=0; i<data.length; i++){
            data[i] = (byte)(Math.random() * Byte.MAX_VALUE);
        }
        return data;
    }

}

class CPU{
    public void freeze(){
        System.out.println("CPU freeze");
    }
    
    public void jump(long position){
        System.out.println("CPU jumping to address: " + Long.toHexString(position));
    }
    
    public void execute(){
        System.out.println("CPU starting execution");
    }
}

class Memory{
    public static final long BOOT_ADDRESS = 0x7C00; 
    public void load(long position, byte[] data){
        System.out.println(data.length + " bytes loaded to memory address " + Long.toHexString(position) + ":");
        for(int i=0; i<data.length; i++){
            System.out.print(toHexString(data[i]) + " ");
            if((i+1)%16 == 0){
                System.out.println();
            }
        }
    }
    
    private String toHexString(byte b){
        char[] values = {'0', '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8',
        '9', 'A' , 'B' , 'C' , 'D' , 'E' , 'F'};
        return "" + values[(b - (b % 16)) / 16] + values[b % 16];
    }
}
    
public class ComputerFacade {
    private final Memory ram;
    private final CPU processor;
    private final HardDrive hd;
    
    public ComputerFacade(){
        ram = new Memory();
        processor = new CPU();
        hd = new HardDrive();
    }
    
    public void start(){
        processor.freeze();
        ram.load(Memory.BOOT_ADDRESS, hd.read(HardDrive.BOOT_SECTOR, HardDrive.SECTOR_SIZE));
        processor.jump(Memory.BOOT_ADDRESS);
        processor.execute();
    }
}



class You{
    public static void main(String[] args){
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}

