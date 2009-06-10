(function(){
	
	var namespace 	  = 'http://purl.oclc.org/NET/sweetdemo';
	
	with (window[namespace]) {
					
			loadScript(base + '/Library/uuid-0.2/uuid-0.2.js');
			loadScript(base + '/Library/rdfa/rdfa.js');

            //DWR
            if (typeof this['sweet'] == 'undefined') this.sweet = {};
            if (typeof this['dwr'] == 'undefined') this.dwr = {};
            if (typeof dwr['engine'] == 'undefined') dwr.engine = {};
            if (typeof this['__System'] == 'undefined') this.__System = {};

            sweet._path =  base + '/dwr';
            __System._path = base + '/dwr';
            
            loadScript(base + '/dwr/interface/sweet.js', function(){

                sweet._path =  base + '/dwr';
                __System._path = base + '/dwr';


                loadScript(base + '/dwr/engine.js', function(){

                    __System._path = base + '/dwr';
                    dwr.engine._defaultPath = base + '/dwr';
                    dwr.engine.setRpcType(dwr.engine.ScriptTag);//2.0.1
                    //dwr.engine._ModeHtmlPoll = true;
                    //dwr.engine._ModeHtmlCall = true;
                    //dwr.engine._pollWithXhr = false;
                    dwr.engine.setActiveReverseAjax(true);
                });
            });

            
            

		
		    loadScript(base + '/Frameworks/jQuery/jquery-ui-personalized-1.6rc6/jquery-1.3.1.js', function(){
				jQuery.extend(window[namespace], {
						$:  	jQuery//.noConflict()
					});
				
				//loadScript(base + '/Frameworks/flensed/flXHR.js', function(){
				/*loadScript('http://flxhr.flensed.com/code/build/flXHR.js', function(){
					$.getAjaxTransport = function() {
						return new flensed.flXHR({
								instancePooling: 	true,
								autoUpdatePlayer: 	true,
								xmlResponseText: 	false,
								onerror: 			console.log,
								loadPolicyURL: 		base + '/crossdomain.xml'
							});
					}
					
				});*/
				
				loadScript(base + '/Frameworks/jQuery/jquery-ui-personalized-1.6rc6/jquery-ui-personalized-1.6rc6.js', function(){
				});
				
			});
	}
	
})();

