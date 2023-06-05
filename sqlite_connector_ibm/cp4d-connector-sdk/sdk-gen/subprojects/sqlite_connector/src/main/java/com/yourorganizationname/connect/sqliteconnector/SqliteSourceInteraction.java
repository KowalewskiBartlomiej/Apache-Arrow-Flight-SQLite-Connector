/* *************************************************** */

/* (C) Copyright IBM Corp. 2022                        */

/* *************************************************** */
package com.yourorganizationname.connect.sqliteconnector;

import java.util.List;

import org.apache.arrow.flight.Ticket;

import com.ibm.connect.sdk.api.Record;
import com.ibm.connect.sdk.api.RowBasedSourceInteraction;
import com.ibm.connect.sdk.api.TicketInfo;
import com.ibm.wdp.connect.common.sdk.api.models.CustomFlightAssetDescriptor;
import com.ibm.wdp.connect.common.sdk.api.models.CustomFlightAssetField;
import com.yourorganizationname.connect.sdk.jdbc.JdbcSourceInteraction;

@SuppressWarnings({ "PMD.AvoidDollarSigns", "PMD.ClassNamingConventions" })
public class SqliteSourceInteraction extends JdbcSourceInteraction
{
	private final SqliteConnector connector;
    private final CustomFlightAssetDescriptor asset;
	
    protected SqliteSourceInteraction(SqliteConnector connector, CustomFlightAssetDescriptor asset) throws Exception
    {
        super(connector, asset, null);
        this.connector = connector;
        this.asset = asset;
    }

//    @Override
//    public Record getRecord()
//    {
//        // TODO implement this
//        return null;
//    }

    @Override
    public void close() throws Exception
    {
        super.close();
    }

    @Override
    public List<Ticket> getTickets() throws Exception
    {
        // TODO Auto-generated method stub
        return null;
    }

//    @Override
//    public List<CustomFlightAssetField> getFields()
//    {
//        // TODO Auto-generated method stub
//        return null;
//    }

	@Override
	protected String generateRowLimitPrefix(long rowLimit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String generateRowLimitSuffix(long rowLimit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getPartitioningPredicate(TicketInfo partitionInfo) {
		// TODO Auto-generated method stub
		return null;
	}

}
