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

    public MarketList() {
        marketList =new ArrayList<Market>();
    }
    private Market addMarket()
    {
        Market market = new Market();
        marketList.add(market);
        return market;
    }
}
