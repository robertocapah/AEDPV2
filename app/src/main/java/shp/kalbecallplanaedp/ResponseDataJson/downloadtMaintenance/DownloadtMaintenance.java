package shp.kalbecallplanaedp.ResponseDataJson.downloadtMaintenance;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class DownloadtMaintenance{

	@SerializedName("result")
	private Result result;

	@SerializedName("Data")
	private Data data;

	public void setResult(Result result){
		this.result = result;
	}

	public Result getResult(){
		return result;
	}

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"DownloadtMaintenance{" + 
			"result = '" + result + '\'' + 
			",data = '" + data + '\'' + 
			"}";
		}
}