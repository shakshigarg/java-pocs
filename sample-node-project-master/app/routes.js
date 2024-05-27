const {static} = require("express");

static val="mahi"
static count=0
module.exports = function(app) {

    app.get('/',function(req,res){ // İSTEMCİNİN '/' İSTEĞİNE KARŞILIK VEREN KOD BLOĞU
        //
        // res.render('index'); // INDEX VİEW DOSYASI RENDER EDİLDİ
        count=count+1
        res.send(count);

    });

}