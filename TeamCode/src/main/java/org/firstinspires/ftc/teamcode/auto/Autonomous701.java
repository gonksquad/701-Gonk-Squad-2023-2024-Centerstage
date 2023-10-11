package org.firstinspires.ftc.teamcode.auto;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

//import org.firstinspires.ftc.teamcode.RoadRunner.RRTrajectories;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;


@Autonomous


public class Autonomous701 extends LinearOpMode{

    private DcMotor fl;
    private DcMotor fr;
    private DcMotor bl;
    private DcMotor br;
    private DcMotor action1;
    private DcMotor action2;
    private CRServo action3;
    private CRServo action4;
    private static double DISTANCE;

    @Override
    public void runOpMode() {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
        telemetry.addData("Status", "Initialized");
//        fl = hardwareMap.get(DcMotor.class, "0");
//        fr = hardwareMap.get(DcMotor.class, "1");
//        bl = hardwareMap.get(DcMotor.class, "2");
//        br = hardwareMap.get(DcMotor.class, "3");
//        action1 = hardwareMap.get(DcMotor.class, "action1");
//        action2 = hardwareMap.get(DcMotor.class, "action2");
//        action3 = hardwareMap.get(CRServo.class, "action3");
//        action4 = hardwareMap.get(CRServo.class, "action4");
//        DISTANCE = 20;

//        Trajectory trajectoryForward = drive.trajectoryBuilder(new Pose2d())
//                .forward(DISTANCE)
//                .build();
//
//        Trajectory trajectoryBackward = drive.trajectoryBuilder(trajectoryForward.end())
//                .back(DISTANCE)
//                .build();
//        Trajectory trajectoryLeft = drive.trajectoryBuilder(trajectoryBackward.end())
//                .strafeLeft(DISTANCE)
//                .build();
//        Trajectory trajectoryRight = drive.trajectoryBuilder(trajectoryLeft.end())
//                .strafeRight(DISTANCE)
//                .build();
        TrajectorySequence bottomRight = drive.trajectorySequenceBuilder(new Pose2d(-62, -35, Math.toRadians(0)))
                .forward(27)
                .turn(Math.toRadians(-90))
                .forward(27*2.85)
                .turn(Math.toRadians(-90))
                .forward(27)
                .build();
        TrajectorySequence TESTYWESTY = drive.trajectorySequenceBuilder(new Pose2d(-62,62, Math.toRadians(0)))
                .forward(120)
                .turn(Math.toRadians(180))
                .strafeLeft(120)
                .turn(Math.toRadians(180))
                .back(120)
                .turn(Math.toRadians(90))
                .forward(120)
                .build();

        waitForStart();

        while (opModeIsActive() && !isStopRequested()) {
            drive.followTrajectorySequence(TESTYWESTY);
        }








    }
}
