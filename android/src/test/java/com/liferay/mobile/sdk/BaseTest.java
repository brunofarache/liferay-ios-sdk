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

package com.liferay.mobile.sdk;

import com.liferay.mobile.sdk.auth.Authentication;
import com.liferay.mobile.sdk.auth.BasicAuthentication;
import com.liferay.mobile.sdk.service.Config;
import com.liferay.mobile.sdk.util.PropertiesUtil;

import java.io.IOException;

/**
 * @author Bruno Farache
 */
public abstract class BaseTest {

	public BaseTest() throws IOException {
		props = new PropertiesUtil();

		Authentication auth = new BasicAuthentication(
			props.getLogin(), props.getPassword());

		Config.global(Config.server(props.getUrl()).auth(auth));
	}

	protected PropertiesUtil props;

}