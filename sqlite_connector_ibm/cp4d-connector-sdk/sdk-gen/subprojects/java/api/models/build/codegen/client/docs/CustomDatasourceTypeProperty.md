# CustomDatasourceTypeProperty

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The property name. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the property. |  [optional]
**label** | **String** | The label for the property. |  [optional]
**description** | **String** | The description for the property. |  [optional]
**placeholder** | **String** | An example value for the property. |  [optional]
**required** | **Boolean** | Whether the property is required. |  [optional]
**masked** | **Boolean** | Whether the property should be masked. For example, when the property is a password. |  [optional]
**multiline** | **Boolean** | Whether the property should be displayed in a multi-line field. |  [optional]
**defaultValue** | **String** | The default value for the property if the value is not otherwise specified. |  [optional]
**values** | [**List&lt;DatasourceTypePropertyValues&gt;**](DatasourceTypePropertyValues.md) | If the property type is enum, the list of enumerated values that the property can take. |  [optional]
**group** | **String** | A classification group for the property. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
BOOLEAN | &quot;boolean&quot;
ENUM | &quot;enum&quot;
INTEGER | &quot;integer&quot;
STRING | &quot;string&quot;
