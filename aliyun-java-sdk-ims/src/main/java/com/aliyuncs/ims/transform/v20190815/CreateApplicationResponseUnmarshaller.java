/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ims.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ims.model.v20190815.CreateApplicationResponse;
import com.aliyuncs.ims.model.v20190815.CreateApplicationResponse.Application;
import com.aliyuncs.ims.model.v20190815.CreateApplicationResponse.Application.DelegatedScope;
import com.aliyuncs.ims.model.v20190815.CreateApplicationResponse.Application.DelegatedScope.PredefinedScope;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateApplicationResponseUnmarshaller {

	public static CreateApplicationResponse unmarshall(CreateApplicationResponse createApplicationResponse, UnmarshallerContext _ctx) {
		
		createApplicationResponse.setRequestId(_ctx.stringValue("CreateApplicationResponse.RequestId"));

		Application application = new Application();
		application.setDisplayName(_ctx.stringValue("CreateApplicationResponse.Application.DisplayName"));
		application.setAccessTokenValidity(_ctx.integerValue("CreateApplicationResponse.Application.AccessTokenValidity"));
		application.setSecretRequired(_ctx.booleanValue("CreateApplicationResponse.Application.SecretRequired"));
		application.setAccountId(_ctx.stringValue("CreateApplicationResponse.Application.AccountId"));
		application.setCreateDate(_ctx.stringValue("CreateApplicationResponse.Application.CreateDate"));
		application.setAppName(_ctx.stringValue("CreateApplicationResponse.Application.AppName"));
		application.setUpdateDate(_ctx.stringValue("CreateApplicationResponse.Application.UpdateDate"));
		application.setAppId(_ctx.stringValue("CreateApplicationResponse.Application.AppId"));
		application.setRefreshTokenValidity(_ctx.integerValue("CreateApplicationResponse.Application.RefreshTokenValidity"));
		application.setAppPrincipalName(_ctx.stringValue("CreateApplicationResponse.Application.AppPrincipalName"));
		application.setIsMultiTenant(_ctx.booleanValue("CreateApplicationResponse.Application.IsMultiTenant"));
		application.setAppType(_ctx.stringValue("CreateApplicationResponse.Application.AppType"));
		application.setTenantId(_ctx.stringValue("CreateApplicationResponse.Application.TenantId"));

		List<String> redirectUris = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateApplicationResponse.Application.RedirectUris.Length"); i++) {
			redirectUris.add(_ctx.stringValue("CreateApplicationResponse.Application.RedirectUris["+ i +"]"));
		}
		application.setRedirectUris(redirectUris);

		DelegatedScope delegatedScope = new DelegatedScope();

		List<PredefinedScope> predefinedScopes = new ArrayList<PredefinedScope>();
		for (int i = 0; i < _ctx.lengthValue("CreateApplicationResponse.Application.DelegatedScope.PredefinedScopes.Length"); i++) {
			PredefinedScope predefinedScope = new PredefinedScope();
			predefinedScope.setDescription(_ctx.stringValue("CreateApplicationResponse.Application.DelegatedScope.PredefinedScopes["+ i +"].Description"));
			predefinedScope.setName(_ctx.stringValue("CreateApplicationResponse.Application.DelegatedScope.PredefinedScopes["+ i +"].Name"));

			predefinedScopes.add(predefinedScope);
		}
		delegatedScope.setPredefinedScopes(predefinedScopes);
		application.setDelegatedScope(delegatedScope);
		createApplicationResponse.setApplication(application);
	 
	 	return createApplicationResponse;
	}
}