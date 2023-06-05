# CustomFlightDatasourceType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A unique name, such as \&quot;my_data_source_type\&quot;, that should follow IBM Cloud API Handbook naming standards. |  [optional]
**label** | **String** | A localized, displayable label such as, \&quot;My Data Source Type\&quot;. |  [optional]
**description** | **String** | A localized, displayable description of the data source. |  [optional]
**allowedAsSource** | **Boolean** | Whether the data source can be accessed as a source of data. That is, data can be read from the data source. |  [optional]
**allowedAsTarget** | **Boolean** | Whether the data source can be accessed as a target. That is, data can be written to the data source. |  [optional]
**discovery** | [**DatasourceTypeDiscovery**](DatasourceTypeDiscovery.md) |  |  [optional]
**properties** | [**CustomFlightDatasourceTypeProperties**](CustomFlightDatasourceTypeProperties.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the data source. |  [optional]
**tags** | **List&lt;String&gt;** | Tags associated with a data source type. |  [optional]
**actions** | [**List&lt;CustomDatasourceTypeAction&gt;**](CustomDatasourceTypeAction.md) | The actions supported for the data source. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
DEPRECATED | &quot;deprecated&quot;
INACTIVE | &quot;inactive&quot;
PENDING | &quot;pending&quot;
