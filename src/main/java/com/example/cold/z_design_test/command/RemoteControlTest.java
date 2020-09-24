package com.example.cold.z_design_test.command;

public class RemoteControlTest {
    public static void main(String[] args) {
        Light light=new Light();
        //获取开按钮
        LightOnCommand lightOn=new LightOnCommand(light);
        SimpleRemoteControl remote1=new SimpleRemoteControl(lightOn);

        //获取关按钮
        LightOffCommand lightOff=new LightOffCommand(light);
        SimpleRemoteControl remote2=new SimpleRemoteControl(lightOff);


        remote1.buttonWasPressed();
        remote1.buttonWasPressed();
        remote1.buttonWasPressed();
        remote1.buttonWasPressed();
        remote2.buttonWasPressed();
        remote1.buttonWasPressed();
    }
}
