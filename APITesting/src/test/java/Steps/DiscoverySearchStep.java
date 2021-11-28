package Steps;

import Utils.Endpoint;
import Utils.Request;
import net.serenitybdd.rest.SerenityRest;

public class DiscoverySearchStep {
    Integer page, pageSize;
    public void readDiscoverySearch(){
        Request.Get(Endpoint.endpoint,200);
    }

    public void SuccessGatheringData(){
        page = SerenityRest.then().extract().path("data.data[0].page");
        pageSize = SerenityRest.then().extract().path("data.data[0].pageSize");
        System.out.println(page);
        System.out.println(pageSize);
        //List<String> jsonResponse = SerenityRest.then().extract().response().jsonPath().getList("data");
    }
}