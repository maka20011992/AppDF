/*******************************************************************************
 * Copyright 2012 Vassili Philippov <vassiliphilippov@onepf.org>
 * Copyright 2012 One Platform Foundation <www.onepf.org>
 * Copyright 2012 Yandex <www.yandex.com>
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 ******************************************************************************/

/**
 * Images related logic of AppDF Editor
 * Depends on: jquery.js, appdfedior.js
 */

 $(function() {
    console.log("AppDF Images Init");

    function init() {
        $('body').on('click', '.image-input-moveup', onScreenshotImageInputMoveUp);
        $('body').on('click', '.image-input-movedown', onScreenshotImageInputMoveDown);
    };

    function onScreenshotImageInputMoveUp(e) {
        var $imageInputGroup = $(e.target).closest(".image-input-group");
        var $imageGroup = $imageInputGroup.parent();
        if ($imageInputGroup.prev().length>0) {
            $imageInputGroup.prev().before($imageInputGroup);
        };
        return false;
    };

    function onScreenshotImageInputMoveDown(e) {
        var $imageInputGroup = $(e.target).closest(".image-input-group");
        var $imageGroup = $imageInputGroup.parent();
        if ($imageInputGroup.next().length>0) {
            $imageInputGroup.next().after($imageInputGroup);
        };
        return false;
    };

    init();
 });