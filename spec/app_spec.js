describe("Vending Machine", function() {

  describe("Model", function() {

    var subject;

    beforeEach(function() {
      subject = new VendingMachine.Model();
    });

    it("displays INSERT COIN when created", function() {
      expect(subject.display()).toBe("INSERT COIN");
    });

    it("has any empty coin return when created", function() {
      expect(subject.coinReturn().length).toBe(0);
    });

  });

  describe("View", function() {

    var subject;

    beforeEach(function() {
      setFixtures(
        '<div>' +
          '<div id="display"></div>' +
          '<ul id="coinReturn"></ul>' +
        '</div>');
      subject = new VendingMachine.View();
    });

    it("updates the display", function () {
      subject.setDisplay("foo");
      expect($('#display')).toContainText("foo");
    });

    it("places coins in coin return", function() {
      
      var coins = ["foo", "bar", "baz"];
      subject.setCoinReturn(coins);

      var coinReturn = $("#coinReturn > li")
      expect(coinReturn.length).toBe(3);
      expect(coinReturn[0]).toContainText("foo");
      expect(coinReturn[1]).toContainText("bar");
      expect(coinReturn[2]).toContainText("baz");

    });

  });

});
