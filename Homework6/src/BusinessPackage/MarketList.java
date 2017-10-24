/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

import java.util.ArrayList;

/**
 *
 * @author ragha
 */
public class MarketList {
    private ArrayList<Market> marketList;

    public ArrayList<Market> getMarketList() {
        return marketList;
    }

    public void setMarketList(ArrayList<Market> marketList) {
        this.marketList = marketList;
    }

    public MarketList() {
        marketList =new ArrayList<Market>();
    }
    public Market addMarket()
    {
        Market market = new Market();
        marketList.add(market);
        return market;
    }
    public Market searchByName(String keyword)
    {
        for(Market m : marketList)
        {
            if(m.getMarketName().equalsIgnoreCase(keyword))
            {
                return m;
            }
        }
        return null;
    }
}
