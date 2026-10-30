package org.firstinspires.ftc.teamcode.autos;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;


@Autonomous(name="meow auto red back")
public class meowAutoRed extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
//movement motors
        DcMotor FL = hardwareMap.get(DcMotor.class, "FL");
        DcMotor BL = hardwareMap.get(DcMotor.class, "BL");
        DcMotor FR = hardwareMap.get(DcMotor.class, "FR");
        DcMotor BR = hardwareMap.get(DcMotor.class, "BR");
//launch motors
        //DcMotor Launch = hardwareMap.get(DcMotor.class, "launch");
        //DcMotor launch2 = hardwareMap.get(DcMotor.class, "launch2");
//collection servos
        //CRServo collection = hardwareMap.get(CRServo.class, "collection");
        //CRServo collection2 = hardwareMap.get(CRServo.class, "collection2");
//transport servos
        //CRServo transport = hardwareMap.get(CRServo.class, "transport");
        //CRServo transport2 = hardwareMap.get(CRServo.class, "transport2");

        while (opModeIsActive()){


        }
    }
}
