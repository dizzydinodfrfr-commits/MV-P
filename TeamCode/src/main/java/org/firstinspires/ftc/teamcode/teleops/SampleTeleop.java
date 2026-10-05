package org.firstinspires.ftc.teamcode.teleops;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


public class SampleTeleop extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();

        DcMotor FL = hardwareMap.get(DcMotor.class, "FL");
        DcMotor BL = hardwareMap.get(DcMotor.class, "BL");
        DcMotor FR = hardwareMap.get(DcMotor.class, "FR");
        DcMotor BR = hardwareMap.get(DcMotor.class, "BR");

        while (opModeIsActive()) {

            FL.setPower(-gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
            BL.setPower(-gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
            FR.setPower(gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
            BR.setPower(gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);

        }
    }
}
