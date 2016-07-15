/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

#import "BaseTest.h"
#import "LRJSONObjectWrapper.h"

extern const int PARENT_FOLDER_ID;

/**
 * @author Bruno Farache
 */
@interface ServiceContextTest : BaseTest

- (NSDictionary *)addBookmarkEntry:(NSString *)name
	serviceContext:(LRJSONObjectWrapper *)serviceContext
	error:(NSError *)error;

- (void)deleteBookmarkEntry:(NSDictionary *)entry error:(NSError *)error;

@end