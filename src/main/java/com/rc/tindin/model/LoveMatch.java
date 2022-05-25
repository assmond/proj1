package com.rc.tindin.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoveMatch{
    
    private @Getter @Setter String userOne;
    private @Getter @Setter String userTwo;
    private @Getter @Setter String percentage;
    private @Getter @Setter String result;

    public LoveMatch(String userOne, String userTwo, String percentage, String result) {
        this.userOne = userOne;
        this.userTwo = userTwo;
        this.percentage = percentage;
        this.result = result;
    }

    public String getUserOne(){
        return this.userOne;
    }

    public String getUserTwo(){
        return this.userTwo;
    }

    public String getPercentage(){
        return this.percentage;
    }

    public String getResult(){
        return this.result;
    }

}
