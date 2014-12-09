var VendingMachine = {};

VendingMachine.View = function() {

  this.setCoinReturn = function(coins) {
    coins.forEach(function(coin) {
      $("#coinReturn").append("<li>" + coin + "</li>")
    });
  };

  this.setDisplay = function(value) {
    $("#display").text(value);
  };

};

VendingMachine.Model = function() {

  this.coinReturn = function() {
    return [];
  };

  this.display = function() {
    return "INSERT COIN";
  };

};
