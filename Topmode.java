package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


/**
 * Created by robotics on 11/29/2017.
 */


@TeleOp(name="TeleOp", group="Comp")

public class TopMode extends OpMode {

    FTCBOTHARDWARE robot = new FTCBOTHARDWARE();

    @Override
    public void init() {

        robot.init(hardwareMap);

    }


    @Override
    public void init_loop() {

    }

    @Override
    public void start() {

    }

    @Override
    public void loop() {
        double Left_Stick_Y = gamepad1.left_stick_y;
        double Right_Stick_Y = -gamepad1.right_stick_y;

        robot.FrontLeft.setPower(Left_Stick_Y);
        robot.FrontRight.setPower(Right_Stick_Y);
        robot.BackLeft.setPower(Left_Stick_Y);
        robot.BackRight.setPower(-Right_Stick_Y);

        robot.Lift.setPower(-gamepad2.right_trigger);


        if(gamepad2.x) {
            robot.Shift.setPower(1.);
        } else if(gamepad2.y){
            robot.Shift.setPower(-1.);
        } else {
            robot.Shift.setPower(0);
        }

    }


}
