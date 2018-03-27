package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Gilbert on 3/22/2018.0
 * Gilbert rules!
 */

@TeleOp (name = "Lesson 1 - Basic Logic", group = "teaching")
public class RenegadeTeaching_1_1_Basic_Logic_In_Code extends OpMode
{
    //Hello, and welcome to your first Java class!
    //By putting two slashes before these lines, I can tell the code to ignore this text
    //This is important for leaving comments to explain what your code does, and so you can section off your code
    //Without notes, the code would get really messy!
    //OK, now, let's jump right into this!
    //Ignore the init and loop down below, as we will get into that later
    //All you need to know for now is that the loop is where all of the logic will go

    @Override
    public void init()
    {

    }

    @Override
    public void loop()
    {
        //if statements are written like this! The logic inside the parentheses is the condition
        // IF the condition written in the parentheses is true, the code inside the brackets {} will activate

        //Remember, it is important to know where "if" series begin and end!
        //Why? This is because you might mix logic up!

        //IF SERIES 1
        if (1 > 2)
        {
            //This is the code that will run if the "if" statement is true
            //This code simply makes the phones display the green text
            //Since 1 is never greater than 2, this code will sadly never run however :(
            //Remember, this grey text is simply notes, and is only here for you and I to see
            //The code will not do anything with code noted out

            telemetry.addLine("I will not display, as 1 is not greater than 2! :(");
        }
        //END OF IF SERIES 1

        //Now, let's get more advanced!

        //IF SERIES 2
        if (1 > 2)  //<---Condition 1
        {
            telemetry.addLine("One is greater than two!");    //<---Code executed if condition 1 is true
        }
        else    //Condition 2 (this condition would be that if condition one is false)
        {
            telemetry.addLine("1 is not greater than 2!");  //<---Code executed if first condition is not true
        }
        //END OF IF SERIES 2

        //And now, even more advanced!

        //IF SERIES 3
        if (1 == 0) //<---Condition 1
        {
            telemetry.addLine("1 equals 0!"); //<---Code executed if condition 1 is true
        }
        else if (1 == 1) //<---Condition 2
        {
            telemetry.addLine("1 equals 1!"); //<--- Code executed if condition 1 is false, and condition 2 is true
        }
        else //<---Condition 3
        {
            telemetry.addLine("1 does not equal 0, and 1 does not equal 1!"); //<---Code executed if condition 1 and 2 are false
        }
        //END OF IF SERIES 3

        //How about we introduce some operators?

        //IF SERIES 4
        if (1 == 1 && 2 > 1) //if 1 equals 1 AND 2 is greater than 1
        {
            telemetry.addLine("1 equals 1, and 2 is greater than 1!");
        }
        //END OF IF SERIES 4

        //And how about some more?

        //IF SERIES 5
        if (1 == 1 || 2 > 1) //if 1 equals 1 OR 2 is greater than 1
        {
            telemetry.addLine("Either: 1 equals 1, 2 is greater than 1, or both!");
        }
        else
        {
            telemetry.addLine("1 does not equal 1, and 2 is not greater than 1!");
            //Confused about why the above line says "and"? Well, it's because the "condition 1" code would activate if EITHER of the conditions were true
            //The code inside this "else" activates only if "condition 1" is false, so that means that if this code is activated, neither of the conditions are true
        }
        //END OF IF SERIES 5

        //Let the complexity rise!

        //IF SERIES 6
        if ((3 == 4 && 2 < 6) || (1 < 2 && 0 == 0 && 4 == 4 && 12 < 20))
        {
            telemetry.addLine("Either: 3 equals 4 and 2 is less than 6, 1 is less than 2 and 0 equals 0 and 4 equals 4 and 12 < 20, or both!");
        }
        else
        {
            telemetry.addLine("3 equals 4 and 2 is less than 6 is not true, and 1 is less than 2 and 0 equals 0 and 4 equals 4 and 12 < 20 is not true!");
        }
        //END OF IF SERIES 6

        telemetry.update(); //This sends the telemetry data to the phones

        //Now, try plugging in your Robot Controller, download, and run this code! See how it works!
    }
}