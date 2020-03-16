
# VersionedFlowSnapshotEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**versionedFlowSnapshot** | [**VersionedFlowSnapshot**](VersionedFlowSnapshot.md) | The versioned flow snapshot |  [optional]
**processGroupRevision** | [**RevisionDTO**](RevisionDTO.md) | The Revision of the Process Group under Version Control |  [optional]
**registryId** | **String** | The ID of the Registry that this flow belongs to |  [optional]
**updateDescendantVersionedFlows** | **Boolean** | If the Process Group to be updated has a child or descendant Process Group that is also under Version Control, this specifies whether or not the contents of that child/descendant Process Group should be updated. |  [optional]



