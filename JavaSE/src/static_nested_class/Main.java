package static_nested_class;

import static_nested_class.Facebook.VideoUploader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook facebook = new Facebook();
		facebook.uploadFacebookVideo(false, 150);
		
		System.out.println();

		Tiktok tiktok = new Tiktok();
		tiktok.uploadVideo();
		
		System.out.println();
		
		VideoUploader uploader = new VideoUploader();
		uploader.videoUpload(true, 1);
		
		static_nested_class.Tiktok.VideoUploader uploader2= new static_nested_class.Tiktok.VideoUploader();
		uploader2.upload();
	}

}
