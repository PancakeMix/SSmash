package com.smashdev.ssmash;


import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.app.Activity;


public class Game extends Activity {
	
	Button button1, button2, button3, button4, button5, button6, button7, button8, button9, 
		button10, button11, button12, button13, button14, button15, button16, button17, button18, 
		button19, button20, button21, button22, button23, button24, button25, button26, button27, 
		button28, button29, button30, button31, button32, button33, button34, button35, button36, 
		button37, button38, button39, button40, button41, button42, button43, button44, button45, 
		button46, button47, button48, button49, button50, button51, button52, button53, button54, 
		button55, button56, button57, button58, button59, button60, button61, button62, button63, 
		button64, button65, button66, button67, button68, button69, button70, button71, button72, 
		button73, button74, button75, button76, button77, button78, button79, button80, button81;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game);
		
		
		Board someBoard = new Board();
		
		//Mapping of sudoku board number to corresponding xml button
		button1 = (Button) findViewById(R.id.button1);
		int number1 = someBoard.getNumber(Board.R1, 0);
		String snumber1 = Integer.toString(number1);
		button1.setText(snumber1);
		
		//Mapping of sudoku board number to corresponding xml button
		button2 = (Button) findViewById(R.id.button2);
		int number2 = someBoard.getNumber(Board.R1, 1);
		String snumber2 = Integer.toString(number2);
		button2.setText(snumber2);
		
		//Mapping of sudoku board number to corresponding xml button
		button3 = (Button) findViewById(R.id.button3);
		int number3 = someBoard.getNumber(Board.R1, 2);
		String snumber3 = Integer.toString(number3);
		button3.setText(snumber3);
		
		//Mapping of sudoku board number to corresponding xml button
		button4 = (Button) findViewById(R.id.button4);
		int number4 = someBoard.getNumber(Board.R1, 3);
		String snumber4 = Integer.toString(number4);
		button4.setText(snumber4);

		//Mapping of sudoku board number to corresponding xml button
		button5 = (Button) findViewById(R.id.button5);
		int number5 = someBoard.getNumber(Board.R1, 4);
		String snumber5 = Integer.toString(number5);
		button5.setText(snumber5);
		
		//Mapping of sudoku board number to corresponding xml button
		button6 = (Button) findViewById(R.id.button6);
		int number6 = someBoard.getNumber(Board.R1, 5);
		String snumber6 = Integer.toString(number6);
		button6.setText(snumber6);
		
		//Mapping of sudoku board number to corresponding xml button
		button7 = (Button) findViewById(R.id.button7);
		int number7 = someBoard.getNumber(Board.R1, 6);
		String snumber7 = Integer.toString(number7);
		button7.setText(snumber7);
		
		//Mapping of sudoku board number to corresponding xml button
		button8 = (Button) findViewById(R.id.button8);
		int number8 = someBoard.getNumber(Board.R1, 7);
		String snumber8 = Integer.toString(number8);
		button8.setText(snumber8);
		
		//Mapping of sudoku board number to corresponding xml button
		button9 = (Button) findViewById(R.id.button9);
		int number9 = someBoard.getNumber(Board.R1, 8);
		String snumber9 = Integer.toString(number9);
		button9.setText(snumber9);
		
		//Mapping of sudoku board number to corresponding xml button
		button10 = (Button) findViewById(R.id.button10);
		int number10 = someBoard.getNumber(Board.R2, 0);
		String snumber10 = Integer.toString(number10);
		button10.setText(snumber10);
		
		//Mapping of sudoku board number to corresponding xml button
		button11 = (Button) findViewById(R.id.button11);
		int number11 = someBoard.getNumber(Board.R2, 1);
		String snumber11 = Integer.toString(number11);
		button11.setText(snumber11);
		
		//Mapping of sudoku board number to corresponding xml button
		button12 = (Button) findViewById(R.id.button12);
		int number12 = someBoard.getNumber(Board.R2, 2);
		String snumber12 = Integer.toString(number12);
		button12.setText(snumber12);
		
		//Mapping of sudoku board number to corresponding xml button
		button13 = (Button) findViewById(R.id.button13);
		int number13 = someBoard.getNumber(Board.R2, 3);
		String snumber13 = Integer.toString(number13);
		button13.setText(snumber13);
		
		//Mapping of sudoku board number to corresponding xml button
		button14 = (Button) findViewById(R.id.button14);
		int number14 = someBoard.getNumber(Board.R2, 4);
		String snumber14 = Integer.toString(number14);
		button14.setText(snumber14);
		
		//Mapping of sudoku board number to corresponding xml button
		button15 = (Button) findViewById(R.id.button15);
		int number15 = someBoard.getNumber(Board.R2, 5);
		String snumber15 = Integer.toString(number15);
		button15.setText(snumber15);
		
		//Mapping of sudoku board number to corresponding xml button
		button16 = (Button) findViewById(R.id.button16);
		int number16 = someBoard.getNumber(Board.R2, 6);
		String snumber16 = Integer.toString(number16);
		button16.setText(snumber16);
		
		//Mapping of sudoku board number to corresponding xml button
		button17 = (Button) findViewById(R.id.button17);
		int number17 = someBoard.getNumber(Board.R2, 7);
		String snumber17 = Integer.toString(number17);
		button17.setText(snumber17);
		
		//Mapping of sudoku board number to corresponding xml button
		button18 = (Button) findViewById(R.id.button18);
		int number18 = someBoard.getNumber(Board.R2, 8);
		String snumber18 = Integer.toString(number18);
		button18.setText(snumber18);
		
		//Mapping of sudoku board number to corresponding xml button
		button19 = (Button) findViewById(R.id.button19);
		int number19 = someBoard.getNumber(Board.R3, 0);
		String snumber19 = Integer.toString(number19);
		button19.setText(snumber19);
		
		//Mapping of sudoku board number to corresponding xml button
		button20 = (Button) findViewById(R.id.button20);
		int number20 = someBoard.getNumber(Board.R3, 1);
		String snumber20 = Integer.toString(number20);
		button20.setText(snumber20);
		
		//Mapping of sudoku board number to corresponding xml button
		button21 = (Button) findViewById(R.id.button21);
		int number21 = someBoard.getNumber(Board.R3, 2);
		String snumber21 = Integer.toString(number21);
		button21.setText(snumber21);
		
		//Mapping of sudoku board number to corresponding xml button
		button22 = (Button) findViewById(R.id.button22);
		int number22 = someBoard.getNumber(Board.R3, 3);
		String snumber22 = Integer.toString(number22);
		button22.setText(snumber22);
		
		//Mapping of sudoku board number to corresponding xml button
		button23 = (Button) findViewById(R.id.button23);
		int number23 = someBoard.getNumber(Board.R3, 4);
		String snumber23 = Integer.toString(number23);
		button23.setText(snumber23);
		
		//Mapping of sudoku board number to corresponding xml button
		button24 = (Button) findViewById(R.id.button24);
		int number24 = someBoard.getNumber(Board.R3, 5);
		String snumber24 = Integer.toString(number24);
		button24.setText(snumber24);
		
		//Mapping of sudoku board number to corresponding xml button
		button25 = (Button) findViewById(R.id.button25);
		int number25 = someBoard.getNumber(Board.R3, 6);
		String snumber25 = Integer.toString(number25);
		button25.setText(snumber25);
		
		//Mapping of sudoku board number to corresponding xml button
		button26 = (Button) findViewById(R.id.button26);
		int number26 = someBoard.getNumber(Board.R3, 7);
		String snumber26 = Integer.toString(number26);
		button26.setText(snumber26);
		
		//Mapping of sudoku board number to corresponding xml button
		button27 = (Button) findViewById(R.id.button27);
		int number27 = someBoard.getNumber(Board.R3, 8);
		String snumber27 = Integer.toString(number27);
		button27.setText(snumber27);
		
		//Mapping of sudoku board number to corresponding xml button
		button28 = (Button) findViewById(R.id.button28);
		int number28 = someBoard.getNumber(Board.R4, 0);
		String snumber28 = Integer.toString(number28);
		button28.setText(snumber28);
		
		//Mapping of sudoku board number to corresponding xml button
		button29 = (Button) findViewById(R.id.button29);
		int number29 = someBoard.getNumber(Board.R4, 1);
		String snumber29 = Integer.toString(number29);
		button29.setText(snumber29);
		
		//Mapping of sudoku board number to corresponding xml button
		button30 = (Button) findViewById(R.id.button30);
		int number30 = someBoard.getNumber(Board.R4, 2);
		String snumber30 = Integer.toString(number30);
		button30.setText(snumber30);
		
		//Mapping of sudoku board number to corresponding xml button
		button31 = (Button) findViewById(R.id.button31);
		int number31 = someBoard.getNumber(Board.R4, 3);
		String snumber31 = Integer.toString(number31);
		button31.setText(snumber31);
		
		//Mapping of sudoku board number to corresponding xml button
		button32 = (Button) findViewById(R.id.button32);
		int number32 = someBoard.getNumber(Board.R4, 4);
		String snumber32 = Integer.toString(number32);
		button32.setText(snumber32);
		
		//Mapping of sudoku board number to corresponding xml button
		button33 = (Button) findViewById(R.id.button33);
		int number33 = someBoard.getNumber(Board.R4, 5);
		String snumber33 = Integer.toString(number33);
		button33.setText(snumber33);
		
		//Mapping of sudoku board number to corresponding xml button
		button34 = (Button) findViewById(R.id.button34);
		int number34 = someBoard.getNumber(Board.R4, 6);
		String snumber34 = Integer.toString(number34);
		button34.setText(snumber34);
		
		//Mapping of sudoku board number to corresponding xml button
		button35 = (Button) findViewById(R.id.button35);
		int number35 = someBoard.getNumber(Board.R4, 7);
		String snumber35 = Integer.toString(number35);
		button35.setText(snumber35);
		
		//Mapping of sudoku board number to corresponding xml button
		button36 = (Button) findViewById(R.id.button36);
		int number36 = someBoard.getNumber(Board.R4, 8);
		String snumber36 = Integer.toString(number36);
		button36.setText(snumber36);
		
		//Mapping of sudoku board number to corresponding xml button
		button37 = (Button) findViewById(R.id.button37);
		int number37 = someBoard.getNumber(Board.R5, 0);
		String snumber37 = Integer.toString(number37);
		button37.setText(snumber37);
		
		//Mapping of sudoku board number to corresponding xml button
		button38 = (Button) findViewById(R.id.button38);
		int number38 = someBoard.getNumber(Board.R5, 1);
		String snumber38 = Integer.toString(number38);
		button38.setText(snumber38);
		
		//Mapping of sudoku board number to corresponding xml button
		button39 = (Button) findViewById(R.id.button39);
		int number39 = someBoard.getNumber(Board.R5, 2);
		String snumber39 = Integer.toString(number39);
		button39.setText(snumber39);
		
		//Mapping of sudoku board number to corresponding xml button
		button40 = (Button) findViewById(R.id.button40);
		int number40 = someBoard.getNumber(Board.R5, 3);
		String snumber40 = Integer.toString(number40);
		button40.setText(snumber40);
		
		//Mapping of sudoku board number to corresponding xml button
		button41 = (Button) findViewById(R.id.button41);
		int number41 = someBoard.getNumber(Board.R5, 4);
		String snumber41 = Integer.toString(number41);
		button41.setText(snumber41);
		
		//Mapping of sudoku board number to corresponding xml button
		button42 = (Button) findViewById(R.id.button42);
		int number42 = someBoard.getNumber(Board.R5, 5);
		String snumber42 = Integer.toString(number42);
		button42.setText(snumber42);
		
		//Mapping of sudoku board number to corresponding xml button
		button43 = (Button) findViewById(R.id.button43);
		int number43 = someBoard.getNumber(Board.R5, 6);
		String snumber43 = Integer.toString(number43);
		button43.setText(snumber43);
		
		//Mapping of sudoku board number to corresponding xml button
		button44 = (Button) findViewById(R.id.button44);
		int number44 = someBoard.getNumber(Board.R5, 7);
		String snumber44 = Integer.toString(number44);
		button44.setText(snumber44);
		
		//Mapping of sudoku board number to corresponding xml button
		button45 = (Button) findViewById(R.id.button45);
		int number45 = someBoard.getNumber(Board.R5, 8);
		String snumber45 = Integer.toString(number45);
		button45.setText(snumber45);
		
		//Mapping of sudoku board number to corresponding xml button
		button46 = (Button) findViewById(R.id.button46);
		int number46 = someBoard.getNumber(Board.R6, 0);
		String snumber46 = Integer.toString(number46);
		button46.setText(snumber46);
		
		//Mapping of sudoku board number to corresponding xml button
		button47 = (Button) findViewById(R.id.button47);
		int number47 = someBoard.getNumber(Board.R6, 1);
		String snumber47 = Integer.toString(number47);
		button47.setText(snumber47);
		
		//Mapping of sudoku board number to corresponding xml button
		button48 = (Button) findViewById(R.id.button48);
		int number48 = someBoard.getNumber(Board.R6, 2);
		String snumber48 = Integer.toString(number48);
		button48.setText(snumber48);
		
		//Mapping of sudoku board number to corresponding xml button
		button49 = (Button) findViewById(R.id.button49);
		int number49 = someBoard.getNumber(Board.R6, 3);
		String snumber49 = Integer.toString(number49);
		button49.setText(snumber49);
		
		//Mapping of sudoku board number to corresponding xml button
		button50 = (Button) findViewById(R.id.button50);
		int number50 = someBoard.getNumber(Board.R6, 4);
		String snumber50 = Integer.toString(number50);
		button50.setText(snumber50);
		
		//Mapping of sudoku board number to corresponding xml button
		button51 = (Button) findViewById(R.id.button51);
		int number51 = someBoard.getNumber(Board.R6, 5);
		String snumber51 = Integer.toString(number51);
		button51.setText(snumber51);
		
		//Mapping of sudoku board number to corresponding xml button
		button52 = (Button) findViewById(R.id.button52);
		int number52 = someBoard.getNumber(Board.R6, 6);
		String snumber52 = Integer.toString(number52);
		button52.setText(snumber52);
		
		//Mapping of sudoku board number to corresponding xml button
		button53 = (Button) findViewById(R.id.button53);
		int number53 = someBoard.getNumber(Board.R6, 7);
		String snumber53 = Integer.toString(number53);
		button53.setText(snumber53);
		
		//Mapping of sudoku board number to corresponding xml button
		button54 = (Button) findViewById(R.id.button54);
		int number54 = someBoard.getNumber(Board.R6, 8);
		String snumber54 = Integer.toString(number54);
		button54.setText(snumber54);
		
		//Mapping of sudoku board number to corresponding xml button
		button55 = (Button) findViewById(R.id.button55);
		int number55 = someBoard.getNumber(Board.R7, 0);
		String snumber55 = Integer.toString(number55);
		button55.setText(snumber55);
		
		//Mapping of sudoku board number to corresponding xml button
		button56 = (Button) findViewById(R.id.button56);
		int number56 = someBoard.getNumber(Board.R7, 1);
		String snumber56 = Integer.toString(number56);
		button56.setText(snumber56);
		
		//Mapping of sudoku board number to corresponding xml button
		button57 = (Button) findViewById(R.id.button57);
		int number57 = someBoard.getNumber(Board.R7, 2);
		String snumber57 = Integer.toString(number57);
		button57.setText(snumber57);
		
		//Mapping of sudoku board number to corresponding xml button
		button58 = (Button) findViewById(R.id.button58);
		int number58 = someBoard.getNumber(Board.R7, 3);
		String snumber58 = Integer.toString(number58);
		button58.setText(snumber58);
		
		//Mapping of sudoku board number to corresponding xml button
		button59 = (Button) findViewById(R.id.button59);
		int number59 = someBoard.getNumber(Board.R7, 4);
		String snumber59 = Integer.toString(number59);
		button59.setText(snumber59);
		
		//Mapping of sudoku board number to corresponding xml button
		button60 = (Button) findViewById(R.id.button60);
		int number60 = someBoard.getNumber(Board.R7, 5);
		String snumber60 = Integer.toString(number60);
		button60.setText(snumber60);
		
		//Mapping of sudoku board number to corresponding xml button
		button61 = (Button) findViewById(R.id.button61);
		int number61 = someBoard.getNumber(Board.R7, 6);
		String snumber61 = Integer.toString(number61);
		button61.setText(snumber61);
		
		//Mapping of sudoku board number to corresponding xml button
		button62 = (Button) findViewById(R.id.button62);
		int number62 = someBoard.getNumber(Board.R7, 7);
		String snumber62 = Integer.toString(number62);
		button62.setText(snumber62);
		
		//Mapping of sudoku board number to corresponding xml button
		button63 = (Button) findViewById(R.id.button63);
		int number63 = someBoard.getNumber(Board.R7, 8);
		String snumber63 = Integer.toString(number63);
		button63.setText(snumber63);
		
		//Mapping of sudoku board number to corresponding xml button
		button64 = (Button) findViewById(R.id.button64);
		int number64 = someBoard.getNumber(Board.R8, 0);
		String snumber64 = Integer.toString(number64);
		button64.setText(snumber64);
		
		//Mapping of sudoku board number to corresponding xml button
		button65 = (Button) findViewById(R.id.button65);
		int number65 = someBoard.getNumber(Board.R8, 1);
		String snumber65 = Integer.toString(number65);
		button65.setText(snumber65);
		
		//Mapping of sudoku board number to corresponding xml button
		button66 = (Button) findViewById(R.id.button66);
		int number66 = someBoard.getNumber(Board.R8, 2);
		String snumber66 = Integer.toString(number66);
		button66.setText(snumber66);
		
		//Mapping of sudoku board number to corresponding xml button
		button67 = (Button) findViewById(R.id.button67);
		int number67 = someBoard.getNumber(Board.R8, 3);
		String snumber67 = Integer.toString(number67);
		button67.setText(snumber67);
		
		//Mapping of sudoku board number to corresponding xml button
		button68 = (Button) findViewById(R.id.button68);
		int number68 = someBoard.getNumber(Board.R8, 4);
		String snumber68 = Integer.toString(number68);
		button68.setText(snumber68);
		
		//Mapping of sudoku board number to corresponding xml button
		button69 = (Button) findViewById(R.id.button69);
		int number69 = someBoard.getNumber(Board.R8, 5);
		String snumber69 = Integer.toString(number69);
		button69.setText(snumber69);
		
		//Mapping of sudoku board number to corresponding xml button
		button70 = (Button) findViewById(R.id.button70);
		int number70 = someBoard.getNumber(Board.R8, 6);
		String snumber70 = Integer.toString(number70);
		button70.setText(snumber70);
		
		//Mapping of sudoku board number to corresponding xml button
		button71 = (Button) findViewById(R.id.button71);
		int number71 = someBoard.getNumber(Board.R8, 7);
		String snumber71 = Integer.toString(number71);
		button71.setText(snumber71);
		
		//Mapping of sudoku board number to corresponding xml button
		button72 = (Button) findViewById(R.id.button72);
		int number72 = someBoard.getNumber(Board.R8, 8);
		String snumber72 = Integer.toString(number72);
		button72.setText(snumber72);
		
		//Mapping of sudoku board number to corresponding xml button
		button73 = (Button) findViewById(R.id.button73);
		int number73 = someBoard.getNumber(Board.R9, 0);
		String snumber73 = Integer.toString(number73);
		button73.setText(snumber73);
		
		//Mapping of sudoku board number to corresponding xml button
		button74 = (Button) findViewById(R.id.button74);
		int number74 = someBoard.getNumber(Board.R9, 1);
		String snumber74 = Integer.toString(number74);
		button74.setText(snumber74);
		
		//Mapping of sudoku board number to corresponding xml button
		button75 = (Button) findViewById(R.id.button75);
		int number75 = someBoard.getNumber(Board.R9, 2);
		String snumber75 = Integer.toString(number75);
		button75.setText(snumber75);
		
		//Mapping of sudoku board number to corresponding xml button
		button76 = (Button) findViewById(R.id.button76);
		int number76 = someBoard.getNumber(Board.R9, 3);
		String snumber76 = Integer.toString(number76);
		button76.setText(snumber76);
		
		//Mapping of sudoku board number to corresponding xml button
		button77 = (Button) findViewById(R.id.button77);
		int number77 = someBoard.getNumber(Board.R9, 4);
		String snumber77 = Integer.toString(number77);
		button77.setText(snumber77);
		
		//Mapping of sudoku board number to corresponding xml button
		button78 = (Button) findViewById(R.id.button78);
		int number78 = someBoard.getNumber(Board.R9, 5);
		String snumber78 = Integer.toString(number78);
		button78.setText(snumber78);
		
		//Mapping of sudoku board number to corresponding xml button
		button79 = (Button) findViewById(R.id.button79);
		int number79 = someBoard.getNumber(Board.R9, 6);
		String snumber79 = Integer.toString(number79);
		button79.setText(snumber79);
		
		//Mapping of sudoku board number to corresponding xml button
		button80 = (Button) findViewById(R.id.button80);
		int number80 = someBoard.getNumber(Board.R9, 7);
		String snumber80 = Integer.toString(number80);
		button80.setText(snumber80);
		
		//Mapping of sudoku board number to corresponding xml button
		button81 = (Button) findViewById(R.id.button81);
		int number81 = someBoard.getNumber(Board.R9, 8);
		String snumber81 = Integer.toString(number81);
		button81.setText(snumber81);
		
		
		
		
		
		
	}
}