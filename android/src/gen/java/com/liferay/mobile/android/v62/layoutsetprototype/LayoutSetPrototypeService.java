/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.android.v62.layoutsetprototype;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class LayoutSetPrototypeService extends BaseService {
	public LayoutSetPrototypeService(Session session) {
		super(session);
	}

	public JSONObject addLayoutSetPrototype(JSONObject nameMap, String description, boolean active, boolean layoutsUpdateable, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nameMap", nameMap);
			_params.put("description", description);
			_params.put("active", active);
			_params.put("layoutsUpdateable", layoutsUpdateable);
			_params.put("serviceContext", serviceContext);

			_command.put("/layoutsetprototype/add-layout-set-prototype", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void deleteLayoutSetPrototype(long layoutSetPrototypeId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutSetPrototypeId", layoutSetPrototypeId);

			_command.put("/layoutsetprototype/delete-layout-set-prototype", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject getLayoutSetPrototype(long layoutSetPrototypeId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutSetPrototypeId", layoutSetPrototypeId);

			_command.put("/layoutsetprototype/get-layout-set-prototype", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray search(long companyId, JSONObject active, JSONObject obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("active", active);
			_params.put("obc", obc);

			_command.put("/layoutsetprototype/search", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONObject updateLayoutSetPrototype(long layoutSetPrototypeId, String settings) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutSetPrototypeId", layoutSetPrototypeId);
			_params.put("settings", settings);

			_command.put("/layoutsetprototype/update-layout-set-prototype", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateLayoutSetPrototype(long layoutSetPrototypeId, JSONObject nameMap, String description, boolean active, boolean layoutsUpdateable, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutSetPrototypeId", layoutSetPrototypeId);
			_params.put("nameMap", nameMap);
			_params.put("description", description);
			_params.put("active", active);
			_params.put("layoutsUpdateable", layoutsUpdateable);
			_params.put("serviceContext", serviceContext);

			_command.put("/layoutsetprototype/update-layout-set-prototype", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

}