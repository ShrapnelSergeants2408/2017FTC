package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.TouchSensor;

/**
 * Created by robotics on 11/29/2017.
 */

public class FTCBOTHARDWARE {

    public DcMotor FrontLeft = null;
    public DcMotor FrontRight = null;
    public DcMotor BackLeft = null;
    public DcMotor BackRight = null;

    public DcMotor Lift = null;
    public DcMotor Shift = null;

    public TouchSensor detect = null;

    HardwareMap hMap = null;

    public FTCBOTHARDWARE(){

    }

    public void init(HardwareMap ahMap){

        hMap = ahMap;


        FrontLeft = hMap.get(DcMotor.class, "FL");
        FrontRight = hMap.get(DcMotor.class, "FR");
        BackLeft = hMap.get(DcMotor.class, "BL");
        BackRight = hMap.get(DcMotor.class, "BR");
        Lift = hMap.get(DcMotor.class, "LFT");
        Shift = hMap.get(DcMotor.class, "SFT");

        FrontLeft.setPower(0.0);
        FrontRight.setPower(0.0);
        BackLeft.setPower(0.0);
        BackRight.setPower(0.0);

        Lift.setPower(0.0);
        Shift.setPower(0.0);

        FrontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        FrontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        BackLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        BackRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        Lift.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        Shift.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
}
