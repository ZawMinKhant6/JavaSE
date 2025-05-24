package static_nested_class;

public class Tiktok {
	
	static public class VideoUploader{
		
		public void upload() {
			System.out.println("Your video is uploaded");
		}
	}
	
	public void uploadVideo() {
		VideoUploader uploader = new VideoUploader();
		uploader.upload();
		System.out.println("Tiktok video upload success");
	}
}
