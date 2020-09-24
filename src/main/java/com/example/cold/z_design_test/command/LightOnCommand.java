package com.example.cold.z_design_test.command;

public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if(light.type==0 || light.type==3){
            light.on1();
        }else if(light.type==1){
            light.on2();
        }else{
            light.on3();
        }

    }
}
