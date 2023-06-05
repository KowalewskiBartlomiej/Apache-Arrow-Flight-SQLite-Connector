# CustomFlightAssetsCriteria

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datasourceTypeName** | **String** | The unique name of the custom Arrow Flight data source type. |  [optional]
**connectionProperties** | [**ConnectionProperties**](ConnectionProperties.md) |  |  [optional]
**path** | **String** | The path of the asset. |  [optional]
**discoveryProperties** | [**DiscoveryConfiguration**](DiscoveryConfiguration.md) |  |  [optional]
**filters** | [**DiscoveryFilters**](DiscoveryFilters.md) |  |  [optional]
**offset** | **Integer** | The number of assets to skip before returning results. |  [optional]
**limit** | **Integer** | The limit of the number of assets to return. |  [optional]
**extendedMetadata** | **Boolean** | Whether to return extended metadata details. |  [optional]
**detail** | **Boolean** | Whether to return additional asset-specific details. |  [optional]
**context** | **String** | Whether assets are discovered for the purpose of reading (source) or writing (target). |  [optional]
