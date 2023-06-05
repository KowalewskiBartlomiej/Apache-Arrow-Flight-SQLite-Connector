/* *************************************************** */

/* (C) Copyright IBM Corp. 2022                        */

/* *************************************************** */
package com.yourorganizationname.connect.sqliteconnector;

import com.ibm.connect.sdk.api.Record;
import com.ibm.connect.sdk.api.RowBasedTargetInteraction;
import com.ibm.wdp.connect.common.sdk.api.models.CustomFlightAssetDescriptor;
import com.yourorganizationname.connect.sdk.jdbc.JdbcTargetInteraction;

@SuppressWarnings({ "PMD.AvoidDollarSigns", "PMD.ClassNamingConventions" })
public class SqliteTargetInteraction extends JdbcTargetInteraction
{
	private final SqliteConnector connector;
    private final CustomFlightAssetDescriptor asset;
	
    protected SqliteTargetInteraction(SqliteConnector connector, CustomFlightAssetDescriptor asset) throws Exception
    {
        super(connector, asset);
        this.connector = connector;
        this.asset = asset;
    }

//    @Override
//    public void putRecord(Record record)
//    {
//        // TODO Auto-generated method stub
//
//    }

    @Override
    public void close() throws Exception
    {
        // TODO Auto-generated method stub

    }

    @Override
    public CustomFlightAssetDescriptor putSetup() throws Exception
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CustomFlightAssetDescriptor putWrapup() throws Exception
    {
        // TODO Auto-generated method stub
        return null;
    }

}
