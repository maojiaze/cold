package com.example.cold.z_design_test.command;

/**
 * 遥控器
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(Command command) {
        this.slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
