package static_nested_class;

public class Facebook {
	
	static private Integer maxFileSize=200;
	private boolean shortVideo;
	private int fileSize;
	
	
	
	public Facebook(boolean shortVideo, int fileSize) {
		super();
		this.shortVideo = shortVideo;
		this.fileSize = fileSize;
	}
	
	

	public Facebook() {
		super();
	}



	static class VideoUploader{
		
		
		public void videoUpload(boolean shortVideo,int fileSize) {
			Facebook fb = new Facebook(shortVideo,fileSize);
			if(fb.shortVideo) {
				System.out.println("Your short video is uploaded");
			}
			else {
				if(fb.fileSize <= maxFileSize) {
					System.out.println("Your Video is Uploaded");
				}
				
			}
		}
	}
	
	public void uploadFacebookVideo(boolean shortVideo,int fileSize) {
			VideoUploader videoUploader = new VideoUploader();
			videoUploader.videoUpload(shortVideo,fileSize);
			System.out.println("Facebook video upload success");
	}
}
