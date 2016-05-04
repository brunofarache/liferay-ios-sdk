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

package com.liferay.mobile.sdk.service;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.json.GenericListType;
import com.liferay.mobile.sdk.rx.OnCallSubscribe;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import rx.Observable;

/**
 * @author Bruno Farache
 */
public class ObservableGroupService {

	public Observable<List<Site>> getUserSites() {
		JSONObject command = new JSONObject();

		try {
			command.put("/group/get-user-sites", new JSONObject());
		}
		catch (JSONException je) {
		}

		GenericListType<Site> type = new GenericListType<>(Site.class);
		Call<List<Site>> call = new Call<>(command, type);
		return Observable.create(new OnCallSubscribe<>(call));
	}

}