// as at v5.16 from manual section 12.2
.var dataTemplate = "Xcoord=0,Ycoord=$100, BounceData=$200"
.var file = LoadBinary("moveData", dataTemplate)
Xcoord: .fill file.getXCoordSize(), file.getXCoord(i)
Ycoord: .fill file.getYCoordSize(), file.getYCoord(i)
BounceData: .fill file.getBounceDataSize(), file.getBounceData(i)