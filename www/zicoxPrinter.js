module.exports = {
	printBarcode: function(packageId, successCallback, failureCallback){
		cordova.exec(successCallback,
					 failureCallback,
					"ZicoxPrinter",
					"printBarcode",
					[packageId]);
	},
	printLabel: function(data, successCallback, failureCallback){
		cordova.exec(successCallback,
					 failureCallback,
					"ZicoxPrinter",
					"printLabel",
					[data]);
	}
  // startPayment: function(orderId, customerId, email, phone, amount, successCallback, failureCallback) {
  //   cordova.exec(successCallback,
  //                failureCallback, 
  //                "PayTM",
  //                "startPayment",
  //                [orderId, customerId, email, phone, amount]);
  // }
};



