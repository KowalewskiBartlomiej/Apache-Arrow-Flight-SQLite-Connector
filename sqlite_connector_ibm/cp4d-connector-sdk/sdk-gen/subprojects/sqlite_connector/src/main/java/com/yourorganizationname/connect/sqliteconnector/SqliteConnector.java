/* *************************************************** */

/* (C) Copyright IBM Corp. 2022                        */

/* *************************************************** */
package com.yourorganizationname.connect.sqliteconnector;

import static org.slf4j.LoggerFactory.getLogger;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.arrow.flight.Ticket;
import org.slf4j.Logger;

import com.ibm.connect.sdk.api.RowBasedConnector;
import com.ibm.connect.sdk.util.ModelMapper;
import com.ibm.wdp.connect.common.sdk.api.models.ConnectionActionConfiguration;
import com.ibm.wdp.connect.common.sdk.api.models.ConnectionActionResponse;
import com.ibm.wdp.connect.common.sdk.api.models.ConnectionProperties;
import com.ibm.wdp.connect.common.sdk.api.models.CustomFlightAssetDescriptor;
import com.ibm.wdp.connect.common.sdk.api.models.CustomFlightAssetsCriteria;
import com.ibm.wdp.connect.common.sdk.api.models.DiscoveredAssetDetails;
import com.ibm.wdp.connect.common.sdk.api.models.DiscoveredAssetExtendedMetadataProperty;
import com.ibm.wdp.connect.common.sdk.api.models.DiscoveredAssetInteractionProperties;
import com.ibm.wdp.connect.common.sdk.api.models.DiscoveredAssetType;
import com.yourorganizationname.connect.sdk.jdbc.JdbcConnector;
import com.yourorganizationname.connect.sdk.jdbc.JdbcSourceInteraction;
import com.yourorganizationname.connect.sdk.jdbc.JdbcTargetInteraction;


@SuppressWarnings({ "PMD.AvoidDollarSigns", "PMD.ClassNamingConventions" })
public class SqliteConnector extends JdbcConnector
{
	private Connection connection;
	
    /**
     * Creates a jdbc connector.
     *
     * @param properties
     *            connection properties
     */
	
	private static final Logger LOGGER = getLogger(JdbcSourceInteraction.class);
	
    public SqliteConnector(ConnectionProperties properties)
    {
        super(properties);
        if (connectionProperties.getProperty("jdbc_url") == null) {
            throw new IllegalArgumentException("Missing host");
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected Driver getDriver() throws Exception
    {
    	try {
    		return (Driver) Class.forName("org.sqlite.JDBC").newInstance();
    	}catch (ClassNotFoundException e){
    		throw new ClassNotFoundException("Class not found!");
    	}
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected String getConnectionURL()
    {
        final StringBuilder urlBuilder = new StringBuilder(50);
        urlBuilder.append("jdbc:sqlite:");
        urlBuilder.append(connectionProperties.getProperty("jdbc_url"));
        return urlBuilder.toString();
    }

    @Override
    public void connect() throws ClassNotFoundException
    {
    	if (connection == null) {
            final String url = getConnectionURL();
            try {
            	LOGGER.info("Connecting to " + url);
            	Class dbDriver = Class.forName("org.sqlite.JDBC");
            	connection = DriverManager.getConnection(url);
            	LOGGER.info("Connected to " + url);
            } catch (SQLException e) {
				e.printStackTrace();
			} finally {
            	LOGGER.info("Connected to " + url);
            }
        }
    }
    

    @Override
    public List<CustomFlightAssetDescriptor> discoverAssets(CustomFlightAssetsCriteria criteria) throws Exception
    {
        // TODO Auto-generated method stub
        return super.discoverAssets(criteria);
    }

//    @Override
//    public SqlliteSourceInteraction getSourceInteraction(CustomFlightAssetDescriptor asset, Ticket ticket)
//    {
//        // TODO include your ticket info
//        return new SqlliteSourceInteraction(this, asset);
//    }
//
//    @Override
//    public SqlliteTargetInteraction getTargetInteraction(CustomFlightAssetDescriptor asset)
//    {
//        return new SqlliteTargetInteraction(this, asset);
//    }

    @Override
    public ConnectionActionResponse performAction(String action, ConnectionActionConfiguration conf)
    {
        // TODO Auto-generated method stub
        return null;
    }

	@Override
	public JdbcSourceInteraction getSourceInteraction(CustomFlightAssetDescriptor asset, Ticket ticket) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public JdbcTargetInteraction getTargetInteraction(CustomFlightAssetDescriptor asset) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

//    @Override
//    public void commit()
//    {
//        // TODO Auto-generated method stub
//
//    }

}
