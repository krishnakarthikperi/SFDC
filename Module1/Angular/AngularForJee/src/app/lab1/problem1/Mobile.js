var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Mobile = /** @class */ (function () {
    function Mobile(mobileId, mobileName, mobileCost) {
        this.mobileCost = mobileCost;
        this.mobileId = mobileId;
        this.mobileName = mobileName;
    }
    Mobile.prototype.printMobileDetails = function () { };
    return Mobile;
}());
var BasicPhone = /** @class */ (function (_super) {
    __extends(BasicPhone, _super);
    function BasicPhone(mobileId, mobileName, mobileCost, mobileType) {
        var _this = _super.call(this, mobileId, mobileName, mobileCost) || this;
        _this.mobileType = mobileType;
        return _this;
    }
    BasicPhone.prototype.printMobileDetails = function () {
        console.log("Mobile ID= " + this.mobileId);
        console.log("Mobile Name= " + this.mobileName);
        console.log("Mobile Cost= " + this.mobileCost);
        console.log("Mobile Type= " + this.mobileType);
    };
    return BasicPhone;
}(Mobile));
var SmartPhone = /** @class */ (function (_super) {
    __extends(SmartPhone, _super);
    function SmartPhone(mobileId, mobileName, mobileCost, mobileType) {
        var _this = _super.call(this, mobileId, mobileName, mobileCost) || this;
        _this.mobileType = mobileType;
        return _this;
    }
    SmartPhone.prototype.printMobileDetails = function () {
        console.log("Mobile ID= " + this.mobileId);
        console.log("Mobile Name= " + this.mobileName);
        console.log("Mobile Cost= " + this.mobileCost);
        console.log("Mobile Type= " + this.mobileType);
    };
    return SmartPhone;
}(Mobile));
var bp = new BasicPhone(101, 'JioPhone', 2999, 'Basic phone');
var sp = new SmartPhone(102, 'JioPhone 5G', 6999, 'Smart phone');
console.log(bp.printMobileDetails());
console.log(sp.printMobileDetails());
