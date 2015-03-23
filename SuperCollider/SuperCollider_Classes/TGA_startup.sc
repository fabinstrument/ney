/*
This class is used as a startup file

Aris Bezas Cardiff 140326

~mySendFFTdata.changeIntensity(1)
*/

Startup_The_God_Article_001 {

	*initClass {
		StartUp add: {
			this.startupTheGodArticle;
		}
	}

	*startupTheGodArticle {
		Task({
			if (not(Server.default.serverRunning)) { Server.default.boot };
			Server.default.doWhenBooted {
				~reactGUI = GUI_react.new;
				0.04.wait;
				~reactGUI.create;
				0.04.wait;
				~routeArduinoValues = RouteArduinoValues.new;
				0.04.wait;
				~makeResponders = MakeResponders.new;
				0.04.wait;
				~makeResponders.all;
				0.04.wait;


				// ~mlabResponders = MakeResponders.new;
				// 0.04.wait;
				// ~mlabResponders.all;
				// 0.04.wait;
				// ~mySendAmpFreq = SendAmpFreq.new;
				// 0.04.wait;
				// ~mySendAmpFreq.start;
				// 0.04.wait;
				// ~mySendOnsets = SendOnsets.new;
				// 0.04.wait;
				// ~mySendOnsets.start;
				// 0.04.wait;
				// ~mySendLoudness = SendLoudness.new;
				// 0.04.wait;
				// ~mySendLoudness.start;
				// 0.04.wait;
				// ~mySendSpecCentroid = SendSpecCentroid.new;
				// 0.04.wait;
				// ~mySendSpecCentroid.start;
				// 0.04.wait;
				// ~mySendSpecFlatness = SendSpecFlatness.new;
				// 0.04.wait;
				// ~mySendSpecFlatness.start;
				// 0.04.wait;
				// ~mySendFFTdata = SendFFTdata.new;
				// 0.04.wait;
				// ~mySendFFTdata.start;
				// 0.04.wait;
				// ~listenSound = Listen_Sound.new;
				// 5.04.wait;
				// //~listenSound.sample
				// //Server.default.mute;
				// ~listenSound.mic


				// 1.wait;
				// 50.do({"\n".postln;});
				// "\n\n\n\n\n\-----------------\nThe God Article\nMachine Listening\n\nAris Bezas\n-----------------".postln;
			};
		}).play;
	}

}