//Adding sample data in Buses collection
db.bus.insert({
    seatCapacity: 100,
     type: "Sleeper",
     Number: 5,
     srcDest: "Pondicherry - Coonoor",
     driverNum: 8754123456,
     schedule: ISODate("2021-05-15T14:00:00Z"),
     currentReservationType: 1,
     seatCharges: 300.05,
     placesofHalt: 4
})

//Adding sample data in owners collection
db.user.insert({
     name: "Bill Franklin",
     busName: "Gotcha Travels",
     phone: 123456789,
     email: "bill_frank@gmail.com",
     address: "234 - Godzilla Street, LA - 50",
     password: "encrypted-256",
     isActive: 1
})

