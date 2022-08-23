class Mobile{
    mobileId:number;
    mobileName:string;
    mobileCost:number;
    constructor(mobileId:number, mobileName:string,mobileCost:number){
        this.mobileCost=mobileCost;
        this.mobileId=mobileId;
        this.mobileName=mobileName;
    }
    printMobileDetails(){}
}

class BasicPhone extends Mobile{
    mobileType:string;
    constructor(mobileId:number, mobileName:string,mobileCost:number,mobileType:string){
        super(mobileId, mobileName,mobileCost);
        this.mobileType=mobileType;
    }
    override printMobileDetails(): void {
        console.log("Mobile ID= "+this.mobileId);
        console.log("Mobile Name= "+this.mobileName);
        console.log("Mobile Cost= "+this.mobileCost);
        console.log("Mobile Type= "+this.mobileType);

    }

}

class SmartPhone extends Mobile{
    mobileType:string;
    constructor(mobileId:number, mobileName:string,mobileCost:number,mobileType:string){
        super(mobileId, mobileName,mobileCost);
        this.mobileType=mobileType;
    }
    override printMobileDetails(): void {
        console.log("Mobile ID= "+this.mobileId);
        console.log("Mobile Name= "+this.mobileName);
        console.log("Mobile Cost= "+this.mobileCost);
        console.log("Mobile Type= "+this.mobileType);

    }
}

const bp = new BasicPhone(101,'JioPhone',2999,'Basic phone');
const sp = new SmartPhone(102,'JioPhone 5G',6999,'Smart phone');
console.log(bp.printMobileDetails());
console.log(sp.printMobileDetails());