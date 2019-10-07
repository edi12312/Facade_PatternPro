/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package you;

/**
 *
 * @author Ga
 */
  public class Computer {
  private CPU cpu;
  private Memory memory;
  private HardDrive hardDrive;

  public Computer() {
    this.cpu = new CPU();
    this.memory = new Memory();
    this.hardDrive = new HardDrive();
  }

  public void startComputer() {
    cpu.freeze();
    memory.load(50, hardDrive.read(35, 40));
    cpu.jump(40);
    cpu.execute();
  }
    
}
