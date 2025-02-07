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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListClustersMetaResponse;
import com.aliyuncs.ehpc.model.v20180412.ListClustersMetaResponse.ClusterInfoSimple;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClustersMetaResponseUnmarshaller {

	public static ListClustersMetaResponse unmarshall(ListClustersMetaResponse listClustersMetaResponse, UnmarshallerContext _ctx) {
		
		listClustersMetaResponse.setRequestId(_ctx.stringValue("ListClustersMetaResponse.RequestId"));
		listClustersMetaResponse.setPageSize(_ctx.integerValue("ListClustersMetaResponse.PageSize"));
		listClustersMetaResponse.setPageNumber(_ctx.integerValue("ListClustersMetaResponse.PageNumber"));
		listClustersMetaResponse.setTotalCount(_ctx.integerValue("ListClustersMetaResponse.TotalCount"));

		List<ClusterInfoSimple> clusters = new ArrayList<ClusterInfoSimple>();
		for (int i = 0; i < _ctx.lengthValue("ListClustersMetaResponse.Clusters.Length"); i++) {
			ClusterInfoSimple clusterInfoSimple = new ClusterInfoSimple();
			clusterInfoSimple.setStatus(_ctx.stringValue("ListClustersMetaResponse.Clusters["+ i +"].Status"));
			clusterInfoSimple.setVpcId(_ctx.stringValue("ListClustersMetaResponse.Clusters["+ i +"].VpcId"));
			clusterInfoSimple.setSchedulerType(_ctx.stringValue("ListClustersMetaResponse.Clusters["+ i +"].SchedulerType"));
			clusterInfoSimple.setDeployMode(_ctx.stringValue("ListClustersMetaResponse.Clusters["+ i +"].DeployMode"));
			clusterInfoSimple.setIsComputeEss(_ctx.booleanValue("ListClustersMetaResponse.Clusters["+ i +"].IsComputeEss"));
			clusterInfoSimple.setOsTag(_ctx.stringValue("ListClustersMetaResponse.Clusters["+ i +"].OsTag"));
			clusterInfoSimple.setAccountType(_ctx.stringValue("ListClustersMetaResponse.Clusters["+ i +"].AccountType"));
			clusterInfoSimple.setDescription(_ctx.stringValue("ListClustersMetaResponse.Clusters["+ i +"].Description"));
			clusterInfoSimple.setName(_ctx.stringValue("ListClustersMetaResponse.Clusters["+ i +"].Name"));
			clusterInfoSimple.setId(_ctx.stringValue("ListClustersMetaResponse.Clusters["+ i +"].Id"));
			clusterInfoSimple.setLocation(_ctx.stringValue("ListClustersMetaResponse.Clusters["+ i +"].Location"));
			clusterInfoSimple.setClientVersion(_ctx.stringValue("ListClustersMetaResponse.Clusters["+ i +"].ClientVersion"));
			clusterInfoSimple.setHasPlugin(_ctx.booleanValue("ListClustersMetaResponse.Clusters["+ i +"].HasPlugin"));

			clusters.add(clusterInfoSimple);
		}
		listClustersMetaResponse.setClusters(clusters);
	 
	 	return listClustersMetaResponse;
	}
}