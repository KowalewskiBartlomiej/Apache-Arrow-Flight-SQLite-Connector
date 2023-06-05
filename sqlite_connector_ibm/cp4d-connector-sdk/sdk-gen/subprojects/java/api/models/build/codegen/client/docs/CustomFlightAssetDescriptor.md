# CustomFlightAssetDescriptor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | An ID for the asset. |  [optional]
**assetType** | [**DiscoveredAssetType**](DiscoveredAssetType.md) |  |  [optional]
**name** | **String** | A name for the asset. |  [optional]
**description** | **String** | A description of the asset. |  [optional]
**tags** | **List&lt;String&gt;** | Tags associated with the asset. |  [optional]
**path** | **String** | The path for the object which can be used to discover child assets. |  [optional]
**hasChildren** | **Boolean** | True if it is known that the asset has children. False if it is known that the asset does not have children. If it is not known, or it is too expensive to determine this, then this property will not be returned. |  [optional]
**details** | [**DiscoveredAssetDetails**](DiscoveredAssetDetails.md) |  |  [optional]
**interactionProperties** | [**DiscoveredAssetInteractionProperties**](DiscoveredAssetInteractionProperties.md) |  |  [optional]
**extendedMetadata** | [**List&lt;DiscoveredAssetExtendedMetadataProperty&gt;**](DiscoveredAssetExtendedMetadataProperty.md) | Extended metadata properties |  [optional]
**datasourceTypeName** | **String** | The unique name of the custom Arrow Flight data source type. |  [optional]
**connectionProperties** | [**ConnectionProperties**](ConnectionProperties.md) |  |  [optional]
**batchSize** | **Integer** | The batch size. |  [optional]
**partitionCount** | **Integer** | The partition count. |  [optional]
**partitionIndex** | **Integer** | The partition index. |  [optional]
**fields** | [**List&lt;CustomFlightAssetField&gt;**](CustomFlightAssetField.md) | Asset fields |  [optional]
