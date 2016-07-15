Pod::Spec.new do |s|
	s.name					= "Liferay-iOS-SDK"
	s.module_name			= "LRMobileSDK"
	s.version				= "6.2.0.22"
	s.summary				= "Build iOS apps for Liferay."
	s.homepage				= "https://github.com/brunofarache/liferay-ios-sdk"
	s.license				= {
								:type => "LPGL 2.1",
								:file => "LICENSE"
							}
	s.authors				= {
								"Bruno Farache" => "bruno.farache@liferay.com"
							}
	s.platform				= :ios
	s.ios.deployment_target	= '7.0'
	s.source				= {
								:git => "https://github.com/brunofarache/liferay-ios-sdk.git",
								:tag => "ios-6.2.0.22"
							}
	s.source_files			= "Source/**/*.{h,m}"
	s.resource_bundles		= {
								"Liferay-iOS-SDK" => [
									"Source/Util/Localization/*.lproj"
								]
							}
	s.requires_arc			= true
	s.dependency			"AFNetworking", "= 2.6.3"
end