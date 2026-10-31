package org.firstinspires.ftc.teamcode.teleops;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="meow main code")
public class meowTeleop extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
// variables for checks and stuff
        int x=0;
//movement motors
        DcMotor FL = hardwareMap.get(DcMotor.class, "FL");
        DcMotor BL = hardwareMap.get(DcMotor.class, "BL");
        DcMotor FR = hardwareMap.get(DcMotor.class, "FR");
        DcMotor BR = hardwareMap.get(DcMotor.class, "BR");
//launch motors
        DcMotor launchM = hardwareMap.get(DcMotor.class, "launchM");
        //DcMotor launch2 = hardwareMap.get(DcMotor.class, "launch2");
//collection servos
        DcMotor collectionM = hardwareMap.get(DcMotor.class, "collectionM");
        CRServo collectionS = hardwareMap.get(CRServo.class, "collectionS");
//transport servos
        //CRServo transport = hardwareMap.get(CRServo.class, "transport");
        //CRServo transport2 = hardwareMap.get(CRServo.class, "transport2");

        while (opModeIsActive()) {
// Controller 1

    // Movement code (for joysticks)
            FL.setPower(gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
            BL.setPower(gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x);
            FR.setPower(-gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
            BR.setPower(-gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x);

    // Collection

        if(gamepad1.aWasPressed()){
            collectionM.setPower(1);
        }


        if(gamepad1.bWasPressed()){
            collectionM.setPower(-1);
        }

        if(gamepad1.yWasPressed()){
            collectionM.setPower(0);
        }

// Controller 2

    // launch
        // launch motor
            if(gamepad2.aWasPressed()){
                launchM.setPower(-1);
            }

            if(gamepad2.aWasReleased()){
                launchM.setPower(0);
            }
        // inverse motor launch
            if(gamepad2.bWasPressed()){
                launchM.setPower(1);
            }

            if(gamepad2.bWasReleased()){
                launchM.setPower(0);
            }

        // movement servo for launch
            if( gamepad2.dpadLeftWasPressed()){
                //does 1 shot then stops?
                collectionS.setPower(1);
            }

        // turn off servo
            if(gamepad2.dpadUpWasPressed()){
                collectionS.setPower(0);
            }


    //

        }
    }
}
