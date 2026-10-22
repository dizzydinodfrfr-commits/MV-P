package org.firstinspires.ftc.teamcode.teleops;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="meow main code")
public class SampleTeleop extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
//movement motors
        DcMotor FL = hardwareMap.get(DcMotor.class, "FL");
        DcMotor BL = hardwareMap.get(DcMotor.class, "BL");
        DcMotor FR = hardwareMap.get(DcMotor.class, "FR");
        DcMotor BR = hardwareMap.get(DcMotor.class, "BR");
//launch motors
        DcMotor Launch = hardwareMap.get(DcMotor.class, "launch");
        DcMotor launch2 = hardwareMap.get(DcMotor.class, "launch2");
//collection servos
        CRServo collection = hardwareMap.get(CRServo.class, "collection");
        CRServo collection2 = hardwareMap.get(CRServo.class, "collection2");
//transport servos
        CRServo transport = hardwareMap.get(CRServo.class, "transport");
        CRServo transport2 = hardwareMap.get(CRServo.class, "transport2");

        while (opModeIsActive()) {
// movement code (for joysticks)
            FL.setPower(gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
            BL.setPower(gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x);
            FR.setPower(-gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
            BR.setPower(-gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x);

        }
    }
}
