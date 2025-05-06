package Facade;
import java.util.Scanner;

public class MediaFacade {
	
	public MusicPlayer  musicPlayer;
	public VideoPlayer videoPlayer;
	public ImageViewer imageViewer;
	
	public MediaFacade() {
		this.imageViewer=new ImageViewer();
		this.musicPlayer=new MusicPlayer();
		this.videoPlayer=new VideoPlayer();
		
	}
	
	public void performAction(String action) {
		
		switch(action.toLowerCase()) {
		case "playmusic":
			musicPlayer.decodeAudio();
			musicPlayer.initializeAudioDrivers();
			musicPlayer.startPlayback();
			break;
			
		case "imageviewers":
			imageViewer.applyScaling();
			imageViewer.displayImage();
			imageViewer.loadImageFile();
			break;
			
		case "videoplayers":
			videoPlayer.loadVideoFile();
			videoPlayer.playVideo();
			videoPlayer.setupRenderingEngine();
			break;
			
		default:
			System.out.println("Invalid actions!");
		}
		
	}

}
